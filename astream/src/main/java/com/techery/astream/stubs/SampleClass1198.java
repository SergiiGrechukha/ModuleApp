package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1198 {

    @Ignore    private SampleClass1199 sampleClass;

    public SampleClass1198(){
        sampleClass = new SampleClass1199();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}