package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1043 {

    @Ignore    private SampleClass1044 sampleClass;

    public SampleClass1043(){
        sampleClass = new SampleClass1044();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}