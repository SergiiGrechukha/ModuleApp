package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1169 {

    @Ignore    private SampleClass1170 sampleClass;

    public SampleClass1169(){
        sampleClass = new SampleClass1170();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}