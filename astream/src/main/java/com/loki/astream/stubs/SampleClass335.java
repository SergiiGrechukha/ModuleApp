package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass335 {

    @Ignore    private SampleClass336 sampleClass;

    public SampleClass335(){
        sampleClass = new SampleClass336();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}