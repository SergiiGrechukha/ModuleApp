package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass891 {

    @Ignore    private SampleClass892 sampleClass;

    public SampleClass891(){
        sampleClass = new SampleClass892();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}