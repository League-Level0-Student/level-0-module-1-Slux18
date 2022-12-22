
void setup() {
size(500,500);    
}
void draw() {
fill(255,255,0);
ellipse(250,225,300,300);
fill(255, 87, 51);
ellipse(250,225,250,250);
PImage pepperoni;
pepperoni = loadImage("pepperoni.png");
image(pepperoni,240,210);
pepperoni.resize(30,30);

}
