package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass583 {

    @Ignore    private SampleClass584 sampleClass;

    public SampleClass583(){
        sampleClass = new SampleClass584();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}