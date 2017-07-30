package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass671 {

    @Ignore    private SampleClass672 sampleClass;

    public SampleClass671(){
        sampleClass = new SampleClass672();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}