package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass568 {

    @Ignore    private SampleClass569 sampleClass;

    public SampleClass568(){
        sampleClass = new SampleClass569();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}