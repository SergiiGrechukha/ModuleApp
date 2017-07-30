package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass674 {

    @Ignore    private SampleClass675 sampleClass;

    public SampleClass674(){
        sampleClass = new SampleClass675();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}