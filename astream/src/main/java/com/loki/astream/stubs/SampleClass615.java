package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass615 {

    @Ignore    private SampleClass616 sampleClass;

    public SampleClass615(){
        sampleClass = new SampleClass616();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}