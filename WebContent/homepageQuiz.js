var fadein_tween = TweenMax.to('#fade-in-out-trigger > h1', .375,{ opacity: 1 });
var fadeout_tween = TweenMax.to('#fade-in-out-trigger> h1', .375,{ opacity: 0 });

var controller = new ScrollMagic.Controller();

var scene1 = new ScrollMagic.Scene({
	'#fade-in-out-trigger',
  reverse: true
})
.setTween(fadein_tween)
.addTo(controller);

})
$(function () {
    $('h1').textillate();
})