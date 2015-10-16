package yarmark.gui;

public class Notes {
	/*
	 *terms:
	 *JFrame: window with title and buttons
	 *Components: what goes in the JFrame
	 *
	 *ex: of components (3 basic ones)
	 *JButton
	 *JTextField- can enter text into it
	 *JLabel- non editable text
	 *
	 *what controls how these looks on a screen?
	 *something controls the sizes of the objects, so that they don't resize when the window resizes
	 *it is NOT absolute pixel dimensions (like a location on a graph)
	 *because there is a lot of unknown about the user screen
	 *
	 *instead
	 *Layout Manager- special classes to help layout options on screen
	 *ranging from simple to complex
	 *
	 *ex: Ecplise
	 *has JButtons laid out horizontally on the toolbar
	 *
	 *give JFrame a set of components to display, and the Layout Manager displays it
	 *
	 *http://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
	 *Flow Layout: lays everything horizontally as long as the screen,
	 *and then wraps to the next line
	 *will resize when window is resized
	 *
	 *Box Layout: displays things vertically or horizontally
	 *
	 *Grid Layout: displays in grid of predefined size
	 *
	 *Border Layout: define screen as NSEWC
	 *NS
	 *height- as little as possible (wrap content)
	 *width- full window
	 *EW
	 *height- full window
	 *width- as little as possible (wrap content)
	 *Center: everything else
	 *this style is used everywhere!
	 *
	 *GUI development often uses inheritance
	 *it extends another class
	 *
	 *if you have multiple programs running in the background, open debug mode and you can see and close them
	 *
	 *
	 *java has 2 gui stuff: Swing and awt
	 *awt- active window toolkit
	 *swing imports always have J imports
	 *
	 *JPanel contains other components
	 *ex: browser
	 *have a border layout
	 *add JPanel to N, which contains many components
	 *
	 *when adding a component to the window, it sits on the default window
	 *getContentPane() returns the default window
	 *
	 *hmwk:
	 *ProjectileGUI in the projectile package
	 *window with same as quadratic
	 *input angle, velocit, time
	 *compute button
	 *display location
	 */
}
