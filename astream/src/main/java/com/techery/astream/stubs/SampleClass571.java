package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass571 {

    @Ignore    private SampleClass572 sampleClass;

    public SampleClass571(){
        sampleClass = new SampleClass572();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}