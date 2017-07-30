package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1953 {

    @Ignore    private SampleClass1954 sampleClass;

    public SampleClass1953(){
        sampleClass = new SampleClass1954();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}