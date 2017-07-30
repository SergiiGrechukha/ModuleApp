package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1084 {

    @Ignore    private SampleClass1085 sampleClass;

    public SampleClass1084(){
        sampleClass = new SampleClass1085();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}