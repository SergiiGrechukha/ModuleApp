package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass726 {

    @Ignore    private SampleClass727 sampleClass;

    public SampleClass726(){
        sampleClass = new SampleClass727();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}