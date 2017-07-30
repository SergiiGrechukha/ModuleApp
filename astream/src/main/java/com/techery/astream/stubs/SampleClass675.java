package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass675 {

    @Ignore    private SampleClass676 sampleClass;

    public SampleClass675(){
        sampleClass = new SampleClass676();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}