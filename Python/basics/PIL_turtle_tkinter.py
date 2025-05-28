import turtle #graphics library to draw shapes
import tkinter #GUI library
from PIL import Image, ImageFilter #image manipulation library

# Create a turtle object
turtle = turtle.Turtle()

#Draw a circle
turtle.color("black")
turtle.circle(20)
turtle.clear()

# Changing colors
turtle.color("red")
turtle.forward(100)
turtle.color("blue")
turtle.forward(100)
turtle.clear()

# Draw a square
turtle.color("black", "green")
turtle.begin_fill()
for i in range(4):
    turtle.forward(50)
    turtle.right(90)
turtle.end_fill()
turtle.clear()

# Dashed line
for i in range(10):
    turtle.forward(5)
    turtle.penup()
    turtle.forward(5)
    turtle.pendown()


# Convert to Grayscale
img = Image.open("image.jpg")
gray = img.convert("L")
gray.save("gray_image.jpg")
# Blur Image
blurred = img.filter(ImageFilter.BLUR)
blurred.save("blurred_image.jpg")
# Merge Two Images Side by Side
img1 = Image.open("image.jpg")
img2 = Image.open("image.jpg")
img2 = img2.resize((img1.width, img1.height))
merged = Image.new('RGB', (img1.width + img2.width, img1.height))
merged.paste(img1, (0, 0))
merged.paste(img2, (img1.width, 0))
merged.save("merged_image.jpg")