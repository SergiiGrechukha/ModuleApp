package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1134 {

    @Ignore    private SampleClass1135 sampleClass;

    public SampleClass1134(){
        sampleClass = new SampleClass1135();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}