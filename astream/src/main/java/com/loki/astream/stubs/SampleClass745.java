package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass745 {

    @Ignore    private SampleClass746 sampleClass;

    public SampleClass745(){
        sampleClass = new SampleClass746();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}