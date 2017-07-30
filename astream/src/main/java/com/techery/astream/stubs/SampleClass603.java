package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass603 {

    @Ignore    private SampleClass604 sampleClass;

    public SampleClass603(){
        sampleClass = new SampleClass604();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}