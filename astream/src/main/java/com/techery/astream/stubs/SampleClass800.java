package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass800 {

    @Ignore    private SampleClass801 sampleClass;

    public SampleClass800(){
        sampleClass = new SampleClass801();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}