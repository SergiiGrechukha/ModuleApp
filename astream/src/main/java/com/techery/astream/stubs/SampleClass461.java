package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass461 {

    @Ignore    private SampleClass462 sampleClass;

    public SampleClass461(){
        sampleClass = new SampleClass462();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}