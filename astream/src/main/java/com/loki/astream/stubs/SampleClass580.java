package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass580 {

    @Ignore    private SampleClass581 sampleClass;

    public SampleClass580(){
        sampleClass = new SampleClass581();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}