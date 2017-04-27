main :: IO () --Eingabe/Ausgabe Funktion
main = do     --merere Befehle
	putStrLn "Geben sie den Namen des Benutzers ein!"
	name <- getLine --String Eingabe
	putStrLn ("Hello " ++ name ++ "!") --String Ausgabe
