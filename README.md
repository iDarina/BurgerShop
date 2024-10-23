![image](https://github.com/user-attachments/assets/8a11a036-7e94-4253-9e41-7f60ec59953f)

### **Step 1: Cloning the Repository to Your IntelliJ**
1. **Obtain the Repository URL:**
   - Make sure you have the team repository url. Here is the team repo https link: `(https://github.com/iDarina/FastFoodShop.git)`.

2. **Open IntelliJ:**
   - Open IntelliJ and navigate to **Main Menu (three lines) > New > Project from Version Control**.

3. **Clone the Repository:**
   - In the "Get from Version Control" window:
     - Paste the repository URL in the **URL** field.
     - Choose a local directory where you want to store the repository.
     - Click **Clone**.

4. **Open the Project:**
   - Once the repository is cloned, IntelliJ will automatically open the project. You’ll now have the codebase available locally.

5. **Ensure You're on the Latest Main Branch:**
   - Open the terminal inside IntelliJ > go to git bash from the drop down (usually located at the bottom) and run the following commands:
     ```bash
     git checkout main
     git pull origin main
     ```
   - This ensures you are on the main branch and have the latest code from the repository.
   - [IF THIS DOES NOT WORK, IT IS PROBABLY BECAUSE YOU HAVE 'master' INSTEAD OF 'main'. TO FIX, DO THE BELOW COMMAND]
   - (Alternative)
       ```bash
     git checkout master
     git pull origin master
     ```

---

### **Step 2: Create Your Own Feature Branch**
1. **Create a New Branch:**
   - In the IntelliJ terminal, type the following command to create a new branch. Replace `feature-branch-name` with a name that represents your task (e.g., `feature-animal`):
     ```bash
     git checkout -b feature-animal
     ```
   - This command creates a new branch called `feature-animal` and switches you to that branch.

2. **Confirm Branch Creation:**
   - To confirm you’re on the new branch, run:
     ```bash
     git branch
     ```
   - You should see an asterisk (*) next to your new branch name, indicating it’s the active branch.

---

### **Step 3: Start Coding in Your Branch**
- Make changes to the code in your IntelliJ IDE.
- Implement your assigned class, add methods, or make any other required modifications.

---

### **Step 4: Stage, Commit, and Push Your Changes**
1. **Stage the Files:**
   - After making changes, stage your files to include them in your next commit.
     ```bash
     git add .
     ```
   - This stages all modified and new files.

2. **Commit the Changes:**
   - Commit your changes with a descriptive message:
     ```bash
     git commit -m "Implemented Animal class with Eater and NoiseMaker interfaces"
     ```
   - This commits the staged changes to your local branch.

3. **Push the Changes to the Remote Repository:**
   - Push your local branch to the remote repository on GitHub:
     ```bash
     git push origin feature-animal
     ```
   - This uploads your branch (`feature-animal`) to the remote repository.

---

### **Step 5: Create a Pull Request to the Group Branch**
1. **Go to GitHub:**
   - Open your GitHub repository in your browser.

2. **Create a Pull Request:**
   - Click on the **Compare & pull request** button next to your branch (`feature-animal`).
   
3. **Select the Base Branch:**
   - In the "base" dropdown menu, choose the appropriate **group branch** (`group1` or `group2`), depending on which group you belong to.
   
4. **Write a PR Description:**
   - Add a clear description of your changes:
     - “This PR implements the Animal class and the required methods for the Eater and NoiseMaker interfaces.”

5. **Submit the PR:**
   - Click **Create pull request**.
   - Notify your Co-Captain that a PR is ready for review.
   - [DO NOT MERGE IT YOURSELF. YOUR CO CAPTAIN WILL REVIEW AND DO THAT FOR YOU]

---

### **Step 6: Respond to Review Comments and Update the PR**
1. **Address Feedback:**
   - If your Co-Captain requests changes, make those changes in your local `feature-animal` branch.
   
2. **Commit and Push the Changes:**
   - After addressing feedback, stage, commit, and push the changes again:
     ```bash
     git add .
     git commit -m "Addressed review comments for Animal class"
     git push origin feature-animal
     ```
   
3. **Update PR:**
   - The PR on GitHub will automatically update with your new commits.

---

### **Step 7: Merge the PR to the Group Branch**
1. **Once the Co-Captain Approves:**
   - The Co-Captain will merge your feature branch (`feature-animal`) into the group branch (`group1` or `group2`).

2. **Keep Your Local Branch Updated:**
   - After merging, switch back to your group branch:
     ```bash
     git checkout group1  # Or group2 if you belong to Group 2
     ```
   - Pull the latest changes from the group branch:
     ```bash
     git pull origin group1
     ```
