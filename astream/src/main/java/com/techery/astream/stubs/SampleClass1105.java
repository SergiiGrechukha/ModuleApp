package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1105 {

    @Ignore    private SampleClass1106 sampleClass;

    public SampleClass1105(){
        sampleClass = new SampleClass1106();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}