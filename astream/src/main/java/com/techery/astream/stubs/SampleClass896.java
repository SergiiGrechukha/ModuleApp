package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass896 {

    @Ignore    private SampleClass897 sampleClass;

    public SampleClass896(){
        sampleClass = new SampleClass897();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}