package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass520 {

    @Ignore    private SampleClass521 sampleClass;

    public SampleClass520(){
        sampleClass = new SampleClass521();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}