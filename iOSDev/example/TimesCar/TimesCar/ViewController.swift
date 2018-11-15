import UIKit

class ViewController: UIViewController {
    
    
    
    @IBOutlet weak var winButton: UIButton!
    @IBOutlet weak var finishLineImageView: UIImageView!
    @IBOutlet var questionLabels: [UILabel]!
    @IBOutlet var carImageViews: [UIImageView]!
    @IBOutlet var questionViews: [UIView]!
    @IBOutlet var topChoiceButtons: [UIButton]!
    @IBOutlet var bottomChoiceButtons: [UIButton]!
    
    
    var questions = [Question]()
    var questionIndexes = [Int](repeating: 0, count: 2)

    let top = 1
    let choiceNumbers = [Int](1...99)
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        questionViews[top].transform = CGAffineTransform(rotationAngle: CGFloat.pi)
        
        // restart
        initGame()
    }
    
    
    // MARK: Functions
    
    func createQuestion() -> Question {

        let numberRange = 1...9
        let number1 = Int.random(in: numberRange)
        let number2 = Int.random(in: numberRange)
        let choiceRange = 0...3
        let answerIndex = Int.random(in: choiceRange) // make answer random in 4 places
        let answer = number1 * number2

        var choices = choiceNumbers.filter { (number) -> Bool in
            return answer != number
        }
        choices.shuffle()
        choices[answerIndex] = answer
        
        let question = Question(title: (number1, number2), choices: Array(choices[choiceRange]))
        questions.append(question)
        return question
    }
    
    func showQuestion(location: Int, question: Question) {
        questionLabels[location].text = "\(question.title.0) × \(question.title.1)"
        if location == top {
            for (i, button) in topChoiceButtons.enumerated() {
                button.setTitle(question.choices[i].description, for: .normal)
            }
        } else {
            for (i, button) in bottomChoiceButtons.enumerated() {
                button.setTitle(question.choices[i].description, for: .normal)
            }
        }
    }
    
    
    
    func initGame() {
        questions.removeAll()
        let question = createQuestion()
        for i in 0...1 {
            questionIndexes[i] = 0
            showQuestion(location: i, question: question)
            carImageViews[i].frame.origin.x = 91
        }
    } // end initGame() function
    
   
    // MARK: Button Functions
    @IBAction func winButtonPressed(_ sender: Any) {
        
        winButton.isHidden = true
        initGame()
        
    } // end winButtonPressed function
    
    
    @IBAction func choiceButtonPressed(_ sender: UIButton) {
        
        let questionViewTag = sender.superview!.tag
        var questionIndex = questionIndexes[questionViewTag]
        let question = questions[questionIndex]
        let answer = question.title.0 * question.title.1
        let choice = question.choices[sender.tag]
        // if the answer is correct, move the car
        if choice == answer {
            UIView.animate(withDuration: 0.5) {
                self.carImageViews[questionViewTag].center.x += 50
            }
        } // end if
        
        if carImageViews[questionViewTag].frame.maxX >= finishLineImageView.frame.minX {
            if questionViewTag == 0 {
                winButton.setTitle("Yellow Win", for: .normal)

            } else {
                winButton.setTitle("White Win", for: .normal)

            }
            winButton.isHidden = false
        }
        
        questionIndex += 1
        questionIndexes[questionViewTag] = questionIndex
        if questionIndex >= questions.count {
            _ = createQuestion()
        }
        showQuestion(location: questionViewTag, question: questions[questionIndex])
    } // end choiceButtonPressed function
    
}

