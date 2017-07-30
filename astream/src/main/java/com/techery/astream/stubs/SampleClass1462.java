package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1462 {

    @Ignore    private SampleClass1463 sampleClass;

    public SampleClass1462(){
        sampleClass = new SampleClass1463();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}