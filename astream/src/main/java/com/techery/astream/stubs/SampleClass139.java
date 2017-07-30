package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass139 {

    @Ignore    private SampleClass140 sampleClass;

    public SampleClass139(){
        sampleClass = new SampleClass140();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}