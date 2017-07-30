package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass549 {

    @Ignore    private SampleClass550 sampleClass;

    public SampleClass549(){
        sampleClass = new SampleClass550();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}