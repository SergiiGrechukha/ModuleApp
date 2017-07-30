package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass925 {

    @Ignore    private SampleClass926 sampleClass;

    public SampleClass925(){
        sampleClass = new SampleClass926();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}