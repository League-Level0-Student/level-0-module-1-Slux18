PImage face;

void setup() {
  size(500,500);
face = loadImage("face.jpeg");
face.resize(500,500);  
}

void draw() {
background(face);
fill(255,0,0);
ellipse(250,200,50,50);
ellipse(350,200,50,50);
fill(0,0,0);
ellipse(250,200,10,10);
ellipse(350,200,10,10);

}
