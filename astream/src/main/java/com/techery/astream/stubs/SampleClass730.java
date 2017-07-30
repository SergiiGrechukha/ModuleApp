package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass730 {

    @Ignore    private SampleClass731 sampleClass;

    public SampleClass730(){
        sampleClass = new SampleClass731();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}