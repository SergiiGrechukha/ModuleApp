package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1121 {

    @Ignore    private SampleClass1122 sampleClass;

    public SampleClass1121(){
        sampleClass = new SampleClass1122();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}