package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass629 {

    @Ignore    private SampleClass630 sampleClass;

    public SampleClass629(){
        sampleClass = new SampleClass630();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}