package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass13 {

    @Ignore    private SampleClass14 sampleClass;

    public SampleClass13(){
        sampleClass = new SampleClass14();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}