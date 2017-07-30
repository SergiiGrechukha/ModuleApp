package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1868 {

    @Ignore    private SampleClass1869 sampleClass;

    public SampleClass1868(){
        sampleClass = new SampleClass1869();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}