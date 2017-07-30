package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass49 {

    @Ignore    private SampleClass50 sampleClass;

    public SampleClass49(){
        sampleClass = new SampleClass50();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}