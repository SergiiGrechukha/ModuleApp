package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1301 {

    @Ignore    private SampleClass1302 sampleClass;

    public SampleClass1301(){
        sampleClass = new SampleClass1302();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}