package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1063 {

    @Ignore    private SampleClass1064 sampleClass;

    public SampleClass1063(){
        sampleClass = new SampleClass1064();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}