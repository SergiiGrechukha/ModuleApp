package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1728 {

    @Ignore    private SampleClass1729 sampleClass;

    public SampleClass1728(){
        sampleClass = new SampleClass1729();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}