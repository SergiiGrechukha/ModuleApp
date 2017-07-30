package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1896 {

    @Ignore    private SampleClass1897 sampleClass;

    public SampleClass1896(){
        sampleClass = new SampleClass1897();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}