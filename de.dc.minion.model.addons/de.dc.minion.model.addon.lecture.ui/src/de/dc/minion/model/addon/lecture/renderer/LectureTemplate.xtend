package de.dc.minion.model.addon.lecture.renderer

import de.dc.minion.model.addon.lecture.LectureProject

class LectureTemplate {
	
	LectureStringSwitch stringSwitch = new LectureStringSwitch
	
	def String gen(LectureProject p)'''
	<!doctype html>
	<html>
		<head>
			<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	
			<title>reveal.js</title>
	
			<link rel="stylesheet" href="css/reset.css">
			<link rel="stylesheet" href="css/reveal.css">
			<link rel="stylesheet" href="css/theme/black.css">
	
			<!-- Theme used for syntax highlighting of code -->
			<link rel="stylesheet" href="lib/css/monokai.css">
	
			<!-- Printing and PDF exports -->
			<script>
				var link = document.createElement( 'link' );
				link.rel = 'stylesheet';
				link.type = 'text/css';
				link.href = window.location.search.match( /print-pdf/gi ) ? 'css/print/pdf.css' : 'css/print/paper.css';
				document.getElementsByTagName( 'head' )[0].appendChild( link );
			</script>
		</head>
		<body>
			<div class="reveal">
				<div class="slides">
					�FOR section : p.sections�
					�stringSwitch.doSwitch(section)�
���					�val useMarkDown = '''�IF section.useMarkDown�data-markdown�ENDIF�'''�
���					<section �useMarkDown�>
���					<h1>�section.name�</h1>
���					
���					<p>
���					�IF section.contents!==null�
���					�FOR content : section.contents�
���					�stringSwitch.doSwitch(content)�
���					�ENDFOR�
���					�ENDIF�
���					</p>
���					</section>
					�ENDFOR�
				</div>
			</div>
	
			<script src="js/reveal.js"></script>
	
			<script>
				// More info about config & dependencies:
				// - https://github.com/hakimel/reveal.js#configuration
				// - https://github.com/hakimel/reveal.js#dependencies
				Reveal.initialize({
					dependencies: [
						{ src: 'plugin/markdown/marked.js' },
						{ src: 'plugin/markdown/markdown.js' },
						{ src: 'plugin/notes/notes.js', async: true },
						{ src: 'plugin/highlight/highlight.js', async: true }
					]
				});
			</script>
		</body>
	</html>
	'''
}