package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1240 {

    @Ignore    private SampleClass1241 sampleClass;

    public SampleClass1240(){
        sampleClass = new SampleClass1241();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}