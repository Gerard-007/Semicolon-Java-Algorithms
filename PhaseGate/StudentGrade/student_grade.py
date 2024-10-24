students = []
student_grades = []
grades = []


def add_students_and_scores(num_of_students, num_of_subjects):
    for number in range(1, num_of_students+1):
        student = str(input(f"Enter the name of student no:{number}: "))
        students.append(student)
        for subject_number in range(1, num_of_subjects+1):
            score = int(input(f"Enter score for subject({subject_number}): "))
            student_grades.append(score)
        grades.append(student_grades.copy())
        student_grades.clear()
    print(students)
    print(grades)


def calculate_score_total():
    for index in range(len(students)):
        total = 0
        for grade in grades[index]:
            total += grade
        grades[index].append(total)
    print(students)
    print(grades)
    

def calculate_score_average(num_of_subjects):
    avg = 0
    for index in range(len(students)):
        avg = grades[index][num_of_subjects-1]/num_of_subjects
        grades[index].append(avg)
    print(students)
    print(grades)
    

def calculate_position():
    averages_with_indices = []
    for index, avg in enumerate(grades):
        average = avg[-1]
        averages_with_indices.append((index, average))
    sorted_averages = sorted(averages_with_indices, key=lambda x:x[1], reverse=True)
    for position, (index, avg) in enumerate(sorted_averages, start=1):
        grades[index].append(position)
    print(grades)


def display_student_grades():
    print("""
    ==========================================
    students  sub1  sub2  sub3 total  avg  pos
    ==========================================
    """)
    for index in range(len(students)):
        print(students[index])
        print("\t")
        for grade in grades[index]:
            print(grade, end=" ")


num_of_students = int(input("Enter number of students: "))
num_of_subjects = int(input("Enter number of subjects: "))

add_students_and_scores(num_of_students, num_of_subjects)

calculate_score_total()

calculate_score_average(num_of_subjects)

calculate_position()

display_student_grades()
