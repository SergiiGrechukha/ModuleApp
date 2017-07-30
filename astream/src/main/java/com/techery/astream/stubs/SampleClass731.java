package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass731 {

    @Ignore    private SampleClass732 sampleClass;

    public SampleClass731(){
        sampleClass = new SampleClass732();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}