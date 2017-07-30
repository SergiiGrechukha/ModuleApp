package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1144 {

    @Ignore    private SampleClass1145 sampleClass;

    public SampleClass1144(){
        sampleClass = new SampleClass1145();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}