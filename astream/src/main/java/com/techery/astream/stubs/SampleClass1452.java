package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1452 {

    @Ignore    private SampleClass1453 sampleClass;

    public SampleClass1452(){
        sampleClass = new SampleClass1453();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}