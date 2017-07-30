package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1307 {

    @Ignore    private SampleClass1308 sampleClass;

    public SampleClass1307(){
        sampleClass = new SampleClass1308();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}