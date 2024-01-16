def decode(message_file):
    '''with open(message_file, 'r') as file:
        lines = file.readlines()
    dict = {}
    for line in lines[:5]:
        key, value = line.split()
        dict[int(float(key))] = value
    message = ' '.join(dict[int(float(i))] for i in lines[5:8])
    return message

print(decode('/Users/joannamcdonald/Downloads/coding_qual_input.txt'))'''
'''def decode(message_file):
    pyramid_lines = []

# Read the input file and extract pyramid lines
    with open(message_file, 'r') as file:
        for line in file:
            pyramid_lines.append(line.strip().split()[1])

    # Extract the words at the end of each pyramid line
    decoded_words = [pyramid_lines[i] for i in range(0, len(pyramid_lines))]

    # Join the words to form the decoded message
    decoded_message = ' '.join(decoded_words)

    return decoded_message

# Example usage:
message_file_path = '/Users/joannamcdonald/Downloads/coding_qual_input.txt'  # Replace with the actual file path
result = decode(message_file_path)
print(result)'''

'''def decode(message_file):
    message_dict = {}
 
    with open(message_file, 'r') as file:
        for line in file:
            parts = line.strip().split(' ')
            if len(parts) == 2:
                number, word = int(parts[0]), parts[1]
                message_dict[number] = word
 
    decoded_message = [message_dict[i] for i in range(1, max(message_dict) + 1) if i in message_dict]
    return ' '.join(decoded_message)'''

def decode(message_file):
    # Step 1: Read the contents of the file and store them in a list
    with open(message_file, 'r') as file:
        content = file.readlines()
    
    # Step 2: Create a dictionary to map the numbers to the corresponding words
    word_map = {}
    for line in content:
        number, word = line.split()
        word_map[int(number)] = word
    
    # Step 3: Sort the numbers in ascending order and construct the pyramid of words
    sorted_numbers = sorted(word_map.keys())
    pyramid = [sorted_numbers[:i+1] for i in range(len(sorted_numbers))]
    
    # Step 4: Retrieve the words corresponding to the numbers at the end of each line of the pyramid
    message_words = [word_map[num] for num in pyramid[-1]]
    
    # Step 5: Concatenate the retrieved words to form the decoded message
    decoded_message = ' '.join(message_words)
    
    return decoded_message

message_file_path = '/Users/joannamcdonald/Downloads/coding_qual_input.txt'  # Replace with the actual file path
result = decode(message_file_path)
print(result)